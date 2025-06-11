<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>GM Game Group Viewer</title>
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
            <table class="table table-striped rounded-3 overflow-hidden">
              <tr>
                <th>ID</th>
                <th>Description</th>
                <th>Day of the Week</th>
                <th>Start Time</th>
                <th>End Time</th>
                <th>Location</th>
                <th>Player Slots</th>
                <th>Actions</th>
              </tr>
              <#list gameGroupList as gameGroup>
              <tr>
                <td>${gameGroup.groupID}</td>
                <td><p class="card-title">${gameGroup.description}</p></td>
                <td><p class="card-subtitle mb-2 text-body-secondary">${gameGroup.dayOfWeek}</p></td>
                <td><p class="card-subtitle mb-2 text-body-secondary">${gameGroup.startTime}</p></td>
                <td><p class="card-subtitle mb-2 text-body-secondary">${gameGroup.endTime}</p></td>
                <td><p class="card-text">${gameGroup.location}</p></td>
                <td><p class="card-text">${gameGroup.playerSlots}</p></td>
                <td><a href="/gamegroups/${gameGroup.groupID}" class="card-link">View</a></td>
              </tr>
              </#list>
            </table>
          </div>
      </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
  </body>
</html>