let seguro = document.getElementById('button');
seguro.addEventListener('click', function() {
        Email.send({
          Host: "smtp.yourmailprovider.com",
          SecureToken: "BwMIDnOQ76qk0yhF",
          To: "javierq150804@gmail.com",
          From: "rikiquintana7@gmail.com",
          Subject: "Prueba de correp",
          Body: "Contenido del correo",
        }).then(
          message => alert("Correo enviado exitosamente: " 
          + message)
        );
});