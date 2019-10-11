var clientesModulo = angular.module('clientesModulo',[]);

clientesModulo.controller("clientesController", function($scope, $http){
    urlVendedoresListaRest = '/MiniERP/rest/vendedor';
    urlClientesListaRest = '/MiniERP/rest/cliente';
    $scope.listagemClientes = function(){
        $http.get(urlClientesListaRest).then(function (response){
            $scope.clientesLista = response.data;
            }
        ), console.error();
    }

    $scope.listagemVendedores = function(){
        $http.get(urlVendedoresListaRest).then(function (response){
            $scope.vendedoresLista = response.data;
            }, console.error()
        );
    }

    $scope.removeVendedorModel = function(){
        $scope.cliente.vendedorModel = null;
    }

    $scope.listagemClientes();
    $scope.listagemVendedores();

    $scope.selecionaCliente = function(clienteSelecionado){
        $scope.cliente = clienteSelecionado;
    }
    
    $scope.limparCliente = function(){
        $scope.cliente = null;
    }

    $scope.gravarCliente = function(){
        if($scope.cliente.codigocliente == undefined){
        //    $scope.cliente.codigocliente = $scope.clientesLista.length + 1;
            $http({method: 'POST', url: urlClientesListaRest, data:$scope.cliente}),console.error();
            $scope.limparCliente();
            $scope.listagemClientes();
        }else{
            $http({method: 'PUT', url: urlClientesListaRest, data:$scope.cliente}), console.error();
            $scope.limparCliente();
            $scope.listagemClientes();
        }        
    }

    $scope.excluirCliente = function(){
        $http({method:'DELETE', 
               url: urlClientesListaRest + '/' + $scope.cliente.codigocliente, 
               //params:$scope.produto.codigoproduto,
               headers:{
                   'Content-Type':'application/json',
                   'Accept':'application/json'
                        }
                }
            ),$scope.limparCliente(),$scope.listagemClientes(), console.error();
        
    }

});
        
/* abaixo os tratamentos totalmente FrontEnd
    $http.get("controller/clientes.json").then(function (response){
        $scope.clientesLista = response.data.clientesCadastradosJSon;
    });

    $scope.excluirCliente = function(){
        $scope.clientesLista.splice($scope.clientesLista.indexOf($scope.cliente),1);
        $scope.limparCliente();
    }
    */