<div ng-app="myApp" ng-controller="myCtrl">
  <h2>{{today}}</h2>
</div>

<script>
  var app = angular.module("myApp", []);
  app.service("dateService", function() {
    this.getDate = function() {
      return new Date().toDateString();
    };
  });
  app.controller("myCtrl", function($scope, dateService) {
    $scope.today = dateService.getDate();
  });
</script>
