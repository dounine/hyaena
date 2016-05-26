<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<div ng-controller="captureController" class="container advantage" style="padding-top: 20px">
	<ul class="nav nav-tabs" role="tablist">
		<li class="nav-item" ng-repeat="item in navs">
			<a class="nav-link {{$first?'active':''}}" href="\#{{item.name}}" role="tab" data-toggle="tab">{{item.name | firstUpCase}}<span class="label label-default label-pill pull-right">{{item.size}}</span></a>
		</li>
	</ul>

	<div class="tab-content choose">
		<div ui-view="{{item.name}}" role="tabpanel" class="tab-pane {{$first?'active':''}}" id="{{item.name}}" ng-repeat="item in navs"></div>
	</div>
	<div>
		<button type="button" class="btn btn-secondary btn-lg btn-block" disabled>CREATE</button>
	</div>
</div>
