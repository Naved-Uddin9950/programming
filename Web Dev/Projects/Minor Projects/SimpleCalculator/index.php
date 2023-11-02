<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Simple Calculator</title>

    <!-- update the version number as needed -->
    <script defer src="/__/firebase/10.5.0/firebase-app-compat.js"></script>
    <!-- include only the Firebase features as you need -->
    <script defer src="/__/firebase/10.5.0/firebase-auth-compat.js"></script>
    <script defer src="/__/firebase/10.5.0/firebase-database-compat.js"></script>
    <script defer src="/__/firebase/10.5.0/firebase-firestore-compat.js"></script>
    <script defer src="/__/firebase/10.5.0/firebase-functions-compat.js"></script>
    <script defer src="/__/firebase/10.5.0/firebase-messaging-compat.js"></script>
    <script defer src="/__/firebase/10.5.0/firebase-storage-compat.js"></script>
    <script defer src="/__/firebase/10.5.0/firebase-analytics-compat.js"></script>
    <script defer src="/__/firebase/10.5.0/firebase-remote-config-compat.js"></script>
    <script defer src="/__/firebase/10.5.0/firebase-performance-compat.js"></script>
    <!-- 
      initialize the SDK after all desired features are loaded, set useEmulator to false
      to avoid connecting the SDK to running emulators.
    -->
    <script defer src="/__/firebase/init.js?useEmulator=true"></script>


    <!-- stylesheets -->
    <link rel="stylesheet" href="css/app.css">
</head>

<body>
    <div class="main-container">
        <div class="logo">
            Simple Calculator
        </div>

        <form action="" method="POST">
            <div class="calculator">
                <h1>Made By: Naved</h1>
                <input type="text" name="firstNum" id="firstNum" placeholder="Enter first number">
                <input type="text" name="secondNum" id="secondNum" placeholder="Enter second number">
                <select name="operator" id="operator">
                    <option value="add">ADD</option>
                    <option value="sub">SUB</option>
                    <option value="mult">MULT</option>
                    <option value="div">DIV</option>
                </select>
                <input type="submit" value="Submit" name="Submit" id="submit">
            </div>
        </form>

        <div class="result">
            <?php
            if (isset($_POST['Submit'])) {
                $firstNum = $_POST['firstNum'];
                $secondNum = $_POST['secondNum'];
                $operator = $_POST['operator'];

                switch ($operator) {
                    case 'add':
                        echo $firstNum . ' + ' . $secondNum . ' = ' . $firstNum + $secondNum;
                        break;

                    case 'sub':
                        echo $firstNum . ' - ' . $secondNum . ' = ' . $firstNum - $secondNum;
                        break;

                    case 'mult':
                        echo $firstNum . ' x ' . $secondNum . ' = ' . $firstNum * $secondNum;
                        break;

                    case 'div':
                        echo $firstNum . ' / ' . $secondNum . ' = ' . $firstNum / $secondNum;
                        break;

                    default:
                        echo 'ERROR: NOT A VALID STATEMENT.';
                        break;
                }
            }
            ?>
        </div>
    </div>




    <script>
      document.addEventListener('DOMContentLoaded', function() {
        const loadEl = document.querySelector('#load');
        // // 🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥
        // // The Firebase SDK is initialized and available here!
        //
        // firebase.auth().onAuthStateChanged(user => { });
        // firebase.database().ref('/path/to/ref').on('value', snapshot => { });
        // firebase.firestore().doc('/foo/bar').get().then(() => { });
        // firebase.functions().httpsCallable('yourFunction')().then(() => { });
        // firebase.messaging().requestPermission().then(() => { });
        // firebase.storage().ref('/path/to/ref').getDownloadURL().then(() => { });
        // firebase.analytics(); // call to activate
        // firebase.analytics().logEvent('tutorial_completed');
        // firebase.performance(); // call to activate
        //
        // // 🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥

        try {
          let app = firebase.app();
          let features = [
            'auth', 
            'database', 
            'firestore',
            'functions',
            'messaging', 
            'storage', 
            'analytics', 
            'remoteConfig',
            'performance',
          ].filter(feature => typeof app[feature] === 'function');
          loadEl.textContent = `Firebase SDK loaded with ${features.join(', ')}`;
        } catch (e) {
          console.error(e);
          loadEl.textContent = 'Error loading the Firebase SDK, check the console.';
        }
      });
    </script>


</body>

</html>