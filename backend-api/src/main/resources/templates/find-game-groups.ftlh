<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Find Game Groups</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" />
    <link rel="stylesheet" href="/css/styles.css" type="text/css" />
  </head>
  <body>
    <nav class="navbar navbar-expand-lg bg-body-tertiary">
      <div class="container-fluid">
        <a class="navbar-brand" href="index.html">D&D Finder</a>
        <button
          class="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navbarNavAltMarkup"
          aria-controls="navbarNavAltMarkup"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
          <div class="navbar-nav">
            <a class="nav-link" href="/players/login">Player Login</a>
            <a class="nav-link" href="/gamemasters/login">Game Master Login</a>
            <a class="nav-link" href="/admin/login">Admin Login</a>
            <a class="nav-link" href="/players/home">Home</a>
            <a class="nav-link" href="/players/profile">Profile</a>
            <a class="nav-link" href="/players/my-game-groups">My Game Groups</a>
            <a class="nav-link active" href="/players/find-game-groups">Find Game Groups</a>
          </div>
        </div>
      </div>
    </nav>

    <div class="container mt-4">
      <h3>Find Game Groups</h3>
      <form action="/gamegroups/search" method="get" class="mb-3">
        <input
          type="text"
          name="term"
          placeholder="Search by group name or description"
          class="form-control"
          required
        />
        <input class="btn btn-primary mt-2" type="submit" value="Search" />
      </form>

      <ul class="list-group">
        <#-- Will be populated with search results from the backend -->
        <#list searchResults as group>
          <li class="list-group-item">
            <a href="/gamegroups/${group.groupID}">${group.name!} - ID: ${group.groupID!}</a>
          </li>
        </#list>
      </ul>
    </div>

    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
