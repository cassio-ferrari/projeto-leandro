var produtosModulo = angular.module('produtosModulo',[]);

produtosModulo.controller("produtosController", function($scope, $http){
    urlProdutosListaRest = '/MiniERP/rest/produto';
    
    $scope.listagemProdutos = function(){
        $http.get(urlProdutosListaRest).then(function (response){
            $scope.produtosLista = response.data;
            }
        ), console.error();
    }
    
    $scope.listagemProdutos();

    $scope.selecionaProduto = function(produtoSelecionado){
        $scope.produto = produtoSelecionado;
    }

    $scope.limparProduto = function(){
        $scope.produto = null;
    }

    $scope.gravarProduto = function(){
        if($scope.produto.codigoproduto == undefined){
            //$scope.produto.codigoproduto = $scope.produtosLista.length + 1;
            $http({method: 'POST', url: urlProdutosListaRest, data:$scope.produto}),console.error(),
            $scope.listagemProdutos(),
            $scope.limparProduto();            
        }else{
            $http({method: 'PUT', url: urlProdutosListaRest, data:$scope.produto}), console.error(),
            $scope.limparProduto(),
            $scope.listagemProdutos();
        }        
    }

    $scope.excluirProduto = function(){
        $http({method:'DELETE', 
               url: urlProdutosListaRest + '/' + $scope.produto.codigoproduto, 
               //params:$scope.produto.codigoproduto,
               headers:{
                   'Content-Type':'application/json',
                   'Accept':'application/json'
                        }
                }
            ),$scope.limparProduto(),$scope.listagemProdutos(), console.error();
        
    }
    /*tratamento total frontend
    $scope.produtosLista= [
        {codigoproduto: 1, descricaoproduto: "nome produto 1", precoproduto:"1.00"},
        {codigoproduto: 2, descricaoproduto: "nome produto 2", precoproduto:"2.00"},
        {codigoproduto: 3, descricaoproduto: "nome produto 3", precoproduto:"3.00"},
        {codigoproduto: 4, descricaoproduto: "nome produto 4", precoproduto:"4.00"},
        {codigoproduto: 5, descricaoproduto: "nome produto 5", precoproduto:"5.00"},
        {codigoproduto: 6, descricaoproduto: "nome produto 6", precoproduto:"6.00"},
        {codigoproduto: 7, descricaoproduto: "nome produto 7", precoproduto:"7.00"}
    ];
    }
            $scope.produtosLista.splice($scope.produtosLista.indexOf($scope.produto),1);

    $http.delete(urlProdutosListaRest + "/" + $scope.produto.codigoproduto).then(function (response){
            alert('rodando delete');
            $scope.limparProduto();
            $scope.listagemProdutos();
        }, function (erro){
            alert('não rodou');
        })
    

    */
});
