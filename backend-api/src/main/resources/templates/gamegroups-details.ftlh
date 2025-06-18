<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>GM Game Group Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
    <link rel="stylesheet" href="../styles.css">
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
          <a class="nav-link" href="/gamemasters/${gameGroup.gameMaster.GMID}">Return to Homepage</a>
        </div>
      </div>
    </div>
  </nav>
    <div class="center">
      <div class="card text-center" style="width: 100%">
          <div class="card">
            <ul class="list-group list-group-flush">
              <h5 class="card-title">ID: ${gameGroup.groupID?c}</h5>
              <li class="list-group-item">Description: ${gameGroup.description}</li>
              <li class="list-group-item">Day of the Week: ${gameGroup.dayOfWeek}</li>
              <li class="list-group-item">Start Time: ${gameGroup.startTime}</li>
              <li class="list-group-item">End Time: ${gameGroup.endTime}</li>
              <li class="list-group-item">Location: ${gameGroup.location}</li>
              <li class="list-group-item">Player Slots: ${gameGroup.playerSlots}</li>
              <a href="/gamegroups/updateForm/${gameGroup.groupID}" class="btn btn-primary">Update Game Group</a>
              <a href="/gamegroups/delete/${gameGroup.groupID}/${gameGroup.gameMaster.GMID}" class="btn btn-danger">Delete Game Group</a>
            </ul>
          </div>
      </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
  </body>
</html>