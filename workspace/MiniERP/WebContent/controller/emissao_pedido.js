var emissaoPedidoModulo = angular.module('emissaoPedidoModulo',[]);

emissaoPedidoModulo.controller("emissaoPedidosController", function($scope, $http){
    urlEmissaoPedidosListaRest = '/MiniERP/rest/pedidovenda';
    
    $scope.listagemPedidosVenda = function(){
        $http.get(urlEmissaoPedidosListaRest).then(function (response){
            $scope.pedidosLista = response.data;
            }
        ), console.error();
    }
    
    $scope.listagemPedidosVenda();

    $scope.selecionaPedido = function(pedidoSelecionado){
        $scope.pedido = pedidoSelecionado;
    }

    $scope.limparPedido = function(){
        $scope.pedido = null;
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
