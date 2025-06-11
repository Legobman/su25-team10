<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>GM Create Game group</title>
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
          <a class="nav-link" href="/gamemasters/1">Return to Homepage</a>
        </div>
      </div>
    </div>
  </nav>
  <div class="center">
    <div class="card text-center" style="width: 18rem;">
        <div class="card-body">
            <h3>${title}</h3>
            <form id="new-group" action="/gamegroups" method="post" >
                <label for="location">Location:</label><br>
                <input type="text" id="location" name="location" required><br>
                <label for="dayOfWeek">Day of the Week Played:</label><br>
                <select name="dayOfWeek" id="dayOfWeek">
                    <option value="sunday">Sunday</option>
                    <option value="monday">Monday</option>
                    <option value="tuesday">Tuesday</option>
                    <option value="wednesday">Wednesday</option>
                    <option value="thursday">Thursday</option>
                    <option value="friday">Friday</option>
                    <option value="saturday">Saturday</option>
                </select><br>
                <label for="startTime">Start Time:</label><br>
                <input type="time" id="startTime" name="startTime" required><br>
                <label for="endTime">End Time:</label><br>
                <input type="time" id="endTime" name="endTime" required><br>
                <label for="playerSlots">Number of Player slots:</label><br>
                <input type="number" id="playerSlots" name="playerSlots" required><br>
                <label for="description">Description of the Game:</label>
                <textarea id="description" name="description" required></textarea>
                <label for="GMID">Your GMID:</label><br>
                <input type="number" id="GMID" name="GMID" required><br>
                <button type="submit" class="btn btn-primary">Save</button>
                <a href="/gamegroups" class="btn btn-outline-danger" >Cancel</a>
            </form>
        </div>
      </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
  </body>
</html> 