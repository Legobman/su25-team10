<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Group membership List by Player</title>
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
          <a class="nav-link" href="/gamemasters/${GMID}">Return to Homepage</a>
        </div>
      </div>
    </div>
  </nav>
  <div class="center">
    <div class="card text-center" style="width: 100%">
        <div class="card-body">
            <#if groupMembershipList?size != 0>
                <h3>The Player: ${groupMembershipList[0].player.username} is in these game groups:</h3>
            <#else>
                <h3>No memberships found for this player.</h3>
            </#if>
            <table class="table table-striped rounded-3 overflow-hidden">
              <tr>
                <th>Membership ID</th>
                <th>Group ID</th>
                <th>Group GM</th>
                <th>Description</th>
                <th>Day of the Week</th>
                <th>Start Time</th>
                <th>End Time</th>
                <th>Location</th>
                <th>Player Slots</th>
              </tr>
              <#list groupMembershipList as membership>
              <tr>
                <td>${membership.membershipID}</td>
                <td>${membership.gamegroup.groupID}</td>
                <td><p class="card-subtitle mb-2 text-body-secondary">${membership.gamegroup.gameMaster.username}</p></td>
                <td><p class="card-title">${membership.gamegroup.description}</p></td>
                <td><p class="card-subtitle mb-2 text-body-secondary">${membership.gamegroup.dayOfWeek}</p></td>
                <td><p class="card-subtitle mb-2 text-body-secondary">${membership.gamegroup.startTime}</p></td>
                <td><p class="card-subtitle mb-2 text-body-secondary">${membership.gamegroup.endTime}</p></td>
                <td><p class="card-text">${membership.gamegroup.location}</p></td>
                <td><p class="card-text">${membership.gamegroup.playerSlots}</p></td>
              </tr>
              </#list>
            </table>
        </div>
      </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
  </body>
</html> 