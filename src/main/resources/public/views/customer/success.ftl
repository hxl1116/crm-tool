<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>CRM Tool</title>
    <link rel="stylesheet" href="../../css/style.css">
</head>
<body>
<header id="main-header">
    <div class="container">
        <h1>Success!</h1>
    </div>
</header>
<nav class="nav-bar">
    <div class="container">
        <#if action == "add">
            <h2>The customer was successfully added to the database.</h2>
        <#elseif action == "update">
            <h2>The customer was successfully updated in the database.</h2>
        <#else>
            <h2>The customer was successfully removed from the database.</h2>
        </#if>
        <ul>
            <li><a href="http://localhost:4567/">Home</a></li>
            <li><a href="http://localhost:4567/customer/show/all">Show Customers</a></li>
        </ul>
    </div>
</nav>
</body>
</html>