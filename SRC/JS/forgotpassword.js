let seguro = document.getElementById('button');
var correo = document.getElementById('input').value;

var review = addEventListener('click', function revisar() {
  if(this.correo == "jquintana@gmail.com"){
      this.alert("Hola Javi");
  }else{
      this.alert("Correo no registrado");
  } 
});

// seguro.addEventListener('click', function() {
//         Email.send({
//           Host: "smtp.yourmailprovider.com",
//           SecureToken: "BwMIDnOQ76qk0yhF",
//           To: "javierq150804@gmail.com",
//           From: "rikiquintana7@gmail.com",
//           Subject: "Prueba de correp",
//           Body: "Contenido del correo",
//         }).then(
//           message => alert("Correo enviado exitosamente: " 
//           + message)
//         );
// });