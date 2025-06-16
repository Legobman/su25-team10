<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Review Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
    <link rel="stylesheet" href="../styles.css">
    </head>
  
<body>
    <nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container-fluid">
      <a class="navbar-brand" href="#">Navbar</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
        <div class="navbar-nav">
          <a class="nav-link" href="#">Player Login</a>
          <a class="nav-link" href="/gamemasters">Game Master Login</a>
          <a class="nav-link" href="#">Admin Login</a>
          <a class="nav-link" href="/gamemasters/1">Return to Homepage</a>
        </div>
      </div>
    </div>
  </nav>
    <div class="center">
      <div class="card text-center" style="width: 100%">
          <div class="card">
            <ul class="list-group list-group-flush">
              <h5 class="card-title">ID: ${review.reviewID?c}</h5>
              <li class="list-group-item">Review: ${review.rating}</li>
              <#if review.response??>
                    <li class="list-group-item">Response: ${review.response}</li>
                <#else>
                    <li class="list-group-item">Review: NA</li>
                </#if>
              <li class="list-group-item">Reviewer: ${review.player.username}</li>
              <li class="list-group-item">Reviewer: ${review.player.playerID}</li>
              <li class="list-group-item">Reviewee: ${review.gameMaster.username}</li>
              <a href="/reviews/updateForm/${review.reviewID}" class="btn btn-primary">Respond to review</a>
            </ul>
          </div>
      </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
  </body>
</html>