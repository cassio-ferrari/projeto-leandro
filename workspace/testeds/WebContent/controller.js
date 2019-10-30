var resultController = angular.module('controllerModule',[]);

controllerModule.controller("indexController", function($scope, $http){
    urlBancoRest = '/testeds/banco';

    $scope.getData = function(){$http.get(urlBancoRest).then(function (response){
    	$scope.bancoGet = response.data;
    	}), console.error();
    };
    $scope.getData();
});