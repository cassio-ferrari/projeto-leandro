var emissaoPedidoModulo = angular.module('emissaoPedidoModulo',[]);

emissaoPedidoModulo.controller("emissaoPedidoController", function($scope, $http){
    urlEmissaoPedidosListaRest = '/MiniERP/rest/pedido';
    urlClientesListaRest = '/MiniERP/rest/cliente';
    urlProdutosListaRest = '/MiniERP/rest/produto';

    
    $scope.listagemPedidosVenda = function(){
        $http.get(urlEmissaoPedidosListaRest).then(function (response){
            $scope.pedidosLista = response.data;
            alert($scope.pedidosLista.length);
            }
        ), console.error();
    }
    
    $scope.listagemPedidosVenda();


    $scope.listagemCliente = function(){
        $http.get(urlClientesListaRest).then(function (response){
            $scope.clienteLista = response.data;
            }
        ), console.error();
    }

    $scope.selecionaPedido = function(pedidoSelecionado){
        $scope.pedido = pedidoSelecionado;
    }

    $scope.limparPedido = function(){
        $scope.pedido = null;
    }

    //simulando inclusão item
    $scope.incluirProduto = function(){
        alert('incluindo produto');
        var produtoNovo = {'codigoproduto':$scope.codigoproduto, 'descricaoproduto':$scope.descricaoproduto, 'qtdepedidoproduto':$scope.qtdepedidoproduto, 'valorunitariopedidoproduto':$scope.valorunitariopedidoproduto, 'valortotalpedidoproduto':$scope.qtdepedidoproduto*$scope.valorunitariopedidoproduto};
        $scope.pedido.produtoModel.push(produtoNovo);
    }



    $scope.gravarPedido = function(){
        if($scope.pedido.codigopedido == undefined){
            //$scope.pedido.codigopedido = $scope.pedidosLista.length + 1;
            $http({method: 'POST', url: urlEmissaoPedidosListaRest, data:$scope.pedido}),console.error();
            $scope.limparPedido();
            $scope.listagemPedidosVenda();
        }else{
            $http({method: 'PUT', url: urlEmissaoPedidosListaRest, data:$scope.pedido}), console.error();
            $scope.limparPedido();
            $scope.listagemPedidosVenda();
        }        
    }

    $scope.excluirPedido = function(){
        $http({method:'DELETE', 
               url: urlEmissaoPedidosListaRest + '/' + $scope.pedido.codigopedido, 
               //params:$scope.produto.codigoproduto,
               headers:{
                   'Content-Type':'application/json',
                   'Accept':'application/json'
                        }
                }
            ),$scope.limparPedido(),$scope.listagemPedidosVenda(), console.error();
    }
});
