<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>GM Response</title>
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
          <a class="nav-link" href="/gamemasters/${review.gameMaster.GMID}">Return to Homepage</a>
        </div>
      </div>
    </div>
  </nav>
  <div class="center">
    <div class="card text-center" style="width: 18rem;">
        <div class="card-body">
            <h3>${title}</h3>
            <form id="new-review" action="/reviews/update/${review.reviewID?c}/${review.gameMaster.GMID}" method="post">
                <label for="reviewID">ReviewID:</label><br>
                <input type="number" id="reviewID" name="reviewID" value="${review.reviewID?c}" readonly /><br>
                <label for="rating">Review:</label><br>
                <input type="text" id="rating" name="rating" value="${review.rating?c}" readonly/><br>
                <label for="response">Respones:</label><br>
                <textarea id="response" name="response" required></textarea>
                <label for="reviewer">Reviewer:</label><br>
                <input type="text" id="reviewer" name="reviewer" value="${review.player.username}" readonly />
                <button type="submit" class="btn btn-primary">Save</button>
                <a href="/reviews/${review.reviewID?c}/${review.gameMaster.GMID}" class="btn btn-outline-danger">Cancel</a>
            </form>
        </div>
      </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
  </body>
</html> 