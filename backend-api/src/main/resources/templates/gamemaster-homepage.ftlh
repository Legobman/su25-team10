<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>GM Homepage</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
    <link rel="stylesheet" href="/css/styles.css" type="text/css">
    </head>
  
<body>
    <nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container-fluid">
      <a class="navbar-brand" href="#">D&D Group Finder</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
        <div class="navbar-nav">
          <a class="nav-link" href="#">Player Login</a>
          <a class="nav-link" href="/gamemasters">Game Master Login</a>
          <a class="nav-link" href="#">Admin Login</a>
        </div>
      </div>
    </div>
  </nav>
    <div class="center">
      <div class="card text-center" style="width: 18rem;">
        <div class="card-body">
          <h3>Welcome ${gamemaster.username}</h3>
          <h3>Your ID: ${gamemaster.GMID}</h3>
          <img src="/Dungeon-Master.webp" alt="Game Master" style="width:60%"><br>
          <a class="btn btn-primary" href="/gamegroups/createForm">Create Game Group</a><br>
          <a class="btn btn-info" href="/gamegroups">View Game Groups</a><br>
          <a class="btn btn-primary" href="/reviews/search/${gamemaster.GMID}">View Reviews</a><br>
          <a class="btn btn-info" href="/memberships">Player Lookup</a><br>
          <a class="btn btn-primary" href="/gamemasters/updateForm/${gamemaster.GMID}">Update Profile</a><br>
          <a class="btn btn-danger" href="/gamemasters/delete/${gamemaster.GMID}">Delete Profile</a>
        </div>
      </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
  </body>
</html>