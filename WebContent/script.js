$(function() {
    var url = 'ws://localhost:8080/WebSocket2/echo';
    var ws = new WebSocket(url);

    ws.onmessage = function(receive) {
        $('#message').text(receive.data);
    };

    ws.onopen = function() {
        ws.send('Hello WebSocket');
    }
});