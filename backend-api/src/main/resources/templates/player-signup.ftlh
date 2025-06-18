<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Player Signup</title>
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
            <a class="nav-link" href="player-login.html">Player Login</a>
            <a class="nav-link" href="gamemaster-login.html">Game Master Login</a>
            <a class="nav-link" href="admin-login.html">Admin Login</a>
          </div>
        </div>
      </div>
    </nav>

    <div class="center">
      <div class="card text-center" style="width: 18rem;">
        <div class="card-body">
          <h3>Player Sign Up</h3>
          <form action="/players" method="post">
            <label for="username">Username:</label><br />
            <input type="text" id="username" name="username" required /><br />
            <label for="password">Password:</label><br />
            <input type="password" id="password" name="password" minlength="8" required /><br />
            <label for="email">Email:</label><br />
            <input type="email" id="email" name="email" required /><br />
            <input class="btn btn-primary mt-2" type="submit" value="Sign Up" />
          </form>
          <a class="btn btn-secondary mt-2" href="/players">Back to Login</a>
        </div>
      </div>
    </div>

    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
