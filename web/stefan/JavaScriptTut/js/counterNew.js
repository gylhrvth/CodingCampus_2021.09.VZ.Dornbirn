window.onload = () => {
    var data_save = 0;
    var count = 0;
    var button = document.getElementById("countButton");
    var display = document.getElementById("displayCount");
    var data = document.getElementById("text");

    if (window.localStorage.getItem('counter')) {
        var count = window.localStorage.getItem('counter');
        data_save = 1;
    }

    display.innerHTML = count;
    var speicher = document.getElementById("speichern");
    var lesen = document.getElementById("lesen");
    var loe = document.getElementById("loeschen");

    button.addEventListener('click', function () {
        count++;
        display.innerHTML = count;
    })

    button.addEventListener('click', function () {
        if (data_save == 1) {
        } else {
            data_save = 1;
            data.innerHTML = '';
        }
        window.localStorage.setItem('counter', count);
    })

    loe.addEventListener('click', function () {
        if (data_save == 1) {
            data.innerHTML = '';
            window.localStorage.clear('counter');
            count = 0;
            data_save = 0;
        } else {
            data.innerHTML = '';
        }
    })

}
