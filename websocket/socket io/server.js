var app = require('express')();
var http = require('http').Server(app);
var io = require('socket.io')(http);

//methode "get" à la racine "/" avec une fonction en paramètre
app.get("/",
    // fonction avec requete et réponse en paramètre
    function (req, res) {
        //en résultat "répertoire courrant" + index.html
        res.sendFile(__dirname + '/index.html');
    })
// ecouter les utilisateurs qui se connectent("connexion")
// on execute une fonction avec un socket en paramètre
io.on('connection', function(socket){
    console.log('a user is connected');
    // ou se déconnectent
    socket.on('disconnect', function(){
        console.log('a user is disconnected');
    })
    /* On écoute les "events" du chat avec une fonction 
        qui prend en paramètre une message
    */
    socket.on('message', function(msg){
        console.log('message reçu : ' + msg);

        io.emit('message', msg);
    })
})

http.listen(3000, 
    function () {
    console.log("server running on, 3000");
})