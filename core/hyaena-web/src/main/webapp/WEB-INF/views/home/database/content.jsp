<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<li ng-repeat="item in list">
	<input tabindex="{{$index}}" type="checkbox" id="{{name}}-checkbox-{{$index}}">
	<label for="{{name}}-checkbox-{{$index}}">{{item.name}}</label>
</li>