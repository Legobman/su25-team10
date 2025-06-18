<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Player Profile</title>
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
            <a class="nav-link active" href="/players/profile">Profile</a>
            <a class="nav-link" href="/players/my-game-groups">My Game Groups</a>
            <a class="nav-link" href="/players/find-game-groups">Find Game Groups</a>
          </div>
        </div>
      </div>
    </nav>

    <div class="container mt-4">
      <h3>Your Profile</h3>
      <form action="/players/profile/update" method="post">
        <div class="mb-3">
          <label for="username" class="form-label">Username:</label>
          <input type="text" class="form-control" id="username" name="username" readonly value="${player.username!}" />
        </div>
        <div class="mb-3">
          <label for="email" class="form-label">Email:</label>
          <input type="email" class="form-control" id="email" name="email" value="${player.email!}" required />
        </div>
        <input class="btn btn-primary" type="submit" value="Update Profile" />
      </form>
    </div>

    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
