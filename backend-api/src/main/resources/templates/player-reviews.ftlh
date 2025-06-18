<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Player Reviews</title>
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
          </div>
        </div>
      </div>
    </nav>

    <div class="container mt-4">
      <h3>Player Reviews</h3>
      <form action="/players/reviews" method="post">
        <div class="mb-3">
          <label for="gameGroupId" class="form-label">Game Group ID:</label>
          <input type="number" class="form-control" id="gameGroupId" name="gameGroupId" required />
        </div>
        <div class="mb-3">
          <label for="reviewText" class="form-label">Review:</label>
          <textarea class="form-control" id="reviewText" name="reviewText" rows="4" required></textarea>
        </div>
        <input class="btn btn-primary" type="submit" value="Submit Review" />
      </form>
    </div>

    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
