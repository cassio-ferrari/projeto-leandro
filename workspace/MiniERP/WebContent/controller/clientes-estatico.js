var clientesModulo = angular.module('clientesModulo',[]);

clientesModulo.controller("clientesController", function($scope){
    //abaixo a criação da variável Array para manipulação dos dados/json backend
    $scope.vendedoresLista = [
        {codigovendedor: 1, nomevendedor: "primeiro vendedor", emailvendedor: "primeirovendedor@dominio.com", telefonevendedor: ""},
        {codigovendedor: 2, nomevendedor: "segundo vendedor", emailvendedor: "segundovendedor@dominio.com", telefonevendedor: ""},
        {codigovendedor: 3, nomevendedor: "terceiro vendedor", emailvendedor: "terceirovendedor@dominio.com", telefonevendedor: ""},
        {codigovendedor: 4, nomevendedor: "quarto vendedor", emailvendedor: "quartovendedor@dominio.com", telefonevendedor: ""}
    ];
	$scope.clientesLista = [
        {codigocliente: 1, nomecliente: 'Nome fantasia 1', cnpjcliente: '00.000.000/0000-00', enderecocliente: 'nome da rua', numeroenderecocliente: 'número da rua ', 
            vendedorcliente: {codigovendedor: 1, nomevendedor: "primeiro vendedor", emailvendedor: "primeirovendedor@dominio.com", telefonevendedor: ""}, 
            telefone1: '(xx) xxxx-xxxx', telefone2: '(xx) xxxx-xxxx', emailcliente: 'email@domínio.com'},
        {codigocliente: 2, nomecliente: 'Nome fantasia 2', cnpjcliente: '00.000.000/0000-00', enderecocliente: 'nome da rua', numeroenderecocliente: 'número da rua ', 
            vendedorcliente: {codigovendedor: 1, nomevendedor: "primeiro vendedor", emailvendedor: "primeirovendedor@dominio.com", telefonevendedor: ""}, 
            telefone1: '(xx) xxxx-xxxx', telefone2: '(xx) xxxx-xxxx', emailcliente: 'email@domínio.com'},
        {codigocliente: 3, nomecliente: 'Nome fantasia 3', cnpjcliente: '00.000.000/0000-00', enderecocliente: 'nome da rua', numeroenderecocliente: 'número da rua ', 
            vendedorcliente: {codigovendedor: 1, nomevendedor: "primeiro vendedor", emailvendedor: "primeirovendedor@dominio.com", telefonevendedor: ""}, 
            telefone1: '(xx) xxxx-xxxx', telefone2: '(xx) xxxx-xxxx', emailcliente: 'email@domínio.com'},
        {codigocliente: 4, nomecliente: 'Nome fantasia 4', cnpjcliente: '00.000.000/0000-00', enderecocliente: 'nome da rua', numeroenderecocliente: 'número da rua ', 
            vendedorcliente: {codigovendedor: 1, nomevendedor: "primeiro vendedor", emailvendedor: "primeirovendedor@dominio.com", telefonevendedor: ""}, 
            telefone1: '(xx) xxxx-xxxx', telefone2: '(xx) xxxx-xxxx', emailcliente: 'email@domínio.com'},
        {codigocliente: 5, nomecliente: 'Nome fantasia 5', cnpjcliente: '00.000.000/0000-00', enderecocliente: 'nome da rua', numeroenderecocliente: 'número da rua ', 
            vendedorcliente: {codigovendedor: 1, nomevendedor: "primeiro vendedor", emailvendedor: "primeirovendedor@dominio.com", telefonevendedor: ""}, 
            telefone1: '(xx) xxxx-xxxx', telefone2: '(xx) xxxx-xxxx', emailcliente: 'email@domínio.com'}
    ];

    $scope.selecionaCliente = function(clienteSelecionado){
        $scope.cliente = clienteSelecionado;
    }
    
    $scope.limparCliente = function(){
        $scope.cliente = null;
    }

    $scope.gravarCliente = function(){
        $scope.clientesLista.push($scope.cliente);
        $scope.limparCliente();
    }

    $scope.excluirCliente = function(){
        $scope.clientesLista.splice($scope.clientesLista.indexOf($scope.cliente),1);
        $scope.limparCliente();
    }
});