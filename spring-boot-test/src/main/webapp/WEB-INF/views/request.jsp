<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en" ng-app="TestApp">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test Spring Boot Application</title>

<script type="text/javascript">
	var contextPath = '<%=request.getContextPath()%>';
</script>
<link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet" media="screen, projection" type="text/css"/>
<link href="${pageContext.request.contextPath}/static/css/app.css" rel="stylesheet" media="screen, projection" type="text/css"/>
 
<script src="${pageContext.request.contextPath}/static/js/jquery.js"></script>   
<script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/angular.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/app.js"></script>
<script src="${pageContext.request.contextPath}/static/js/angular-ui-bootstrap.js"></script>
</head>
<body>
	<div ng-controller="TestCtrl">
		<label for="Message">${msg} {{angularMsg}}</label>
	  	<input type="text" ng-model="angularMsg" name="companyName" id="companyName">
	
		<div class="meta-tabular col-xs-12 col-sm-12 col-md-12 col-lg-12 ng-cloak">
			<table width="100%" cellspacing="0" class="table table-bordered table-striped table-condensed dt-responsive" id="listing-reports" >
				<thead>
					<tr>
						<th>Id</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Email</th>
					</tr>
				</thead>
				<tbody>
				 	<tr ng-repeat="user in userList">
						<td>{{user.id}}</td>
						<td>{{user.firstName}}</td>
						<td>{{user.lastName}}</td>
						<td>{{user.email}}</td>
					</tr>
			    </tbody>
			</table>
			<div align="center" class="margin-report-pagination" data-pagination="" data-num-pages="numPages" 
		      data-current-page="currentPage" data-max-size="maxSize" data-boundary-links="true"></div>
		</div>
	</div>
</body>
</html>