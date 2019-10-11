var vendedoresModulo = angular.module("vendedoresModulo",[]);

vendedoresModulo.controller("vendedoresController", function($scope, $http){
    urlVendedoresListaRest = '/MiniERP/rest/vendedor';

    $scope.listagemVendedores = function(){
        $http.get(urlVendedoresListaRest).then(function (response){
            $scope.vendedoresLista = response.data;
            }, console.error()
        );
    }

    $scope.listagemVendedores();

    $scope.selecionaVendedor = function(vendedorSelecionado){
        $scope.vendedor = vendedorSelecionado;
    }

    $scope.limparVendedor = function(){
        $scope.vendedor = null;
    }

    $scope.gravarVendedor = function(){
        if($scope.vendedor.codigovendedor == undefined){
            //$scope.vendedor.codigovendedor = $scope.vendedoresLista.length + 1;
            $http({method: 'POST', url: urlVendedoresListaRest, data:$scope.vendedor})
                ,$scope.limparVendedor()
                ,$scope.listagemVendedores()
                ,console.error();
        }else{
            $http({method: 'PUT', url: urlVendedoresListaRest, data:$scope.vendedor})
                , $scope.limparVendedor()
                , $scope.listagemVendedores()
                , console.error();
            
            
        }        
    }

    $scope.excluirVendedor = function(){
        $http({method:'DELETE', 
               url: urlVendedoresListaRest + '/' + $scope.vendedor.codigovendedor, 
               //params:$scope.vendedor.codigovendedor,
               headers:{
                   'Content-Type':'application/json',
                   'Accept':'application/json'
                        }
                }
            ),$scope.limparVendedor(),$scope.listagemVendedores(), console.error();
        
    }

    /* tratamento total frontend
    $scope.vendedoresLista = [
        {codigovendedor: 1, nomevendedor: "primeiro vendedor", emailvendedor: "primeirovendedor@dominio.com", telefonevendedor: ""},
        {codigovendedor: 2, nomevendedor: "segundo vendedor", emailvendedor: "segundovendedor@dominio.com", telefonevendedor: ""},
        {codigovendedor: 3, nomevendedor: "terceiro vendedor", emailvendedor: "terceirovendedor@dominio.com", telefonevendedor: ""},
        {codigovendedor: 4, nomevendedor: "quarto vendedor", emailvendedor: "quartovendedor@dominio.com", telefonevendedor: ""}
    ];

    $scope.gravarVendedor = function(){
        $scope.vendedoresLista.push($scope.vendedor);
        $scope.limparVendedor();
    }

    $scope.excluirVendedor = function(){
        $scope.vendedoresLista.splice($scope.vendedoresLista.indexOf($scope.vendedor),1);
        $scope.limparVendedor();
    }
    */
});