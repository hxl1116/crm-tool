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
        <h1>Oops!</h1>
    </div>
</header>
<nav class="nav-bar">
    <div class="container">
        <#if action == "add">
            <h2>There was an error adding the customer to the database.</h2>
        <#elseif action == "update">
            <h2>There was an error updating the customer to the database.</h2>
        <#else>
            <h2>There was an error deleting the customer from the database.</h2>
        </#if>
        <ul>
            <li><a href="http://localhost:4567/">Home</a></li>
            <li><a href="http://localhost:4567/customer/add">Back to Form</a></li>
        </ul>
    </div>
</nav>
</body>
</html>