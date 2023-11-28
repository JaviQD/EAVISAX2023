let rate = document.getElementById("rateus");
let boton = document.getElementById("insertar");
let clean = document.getElementById("Clean");
rate.addEventListener("click", function(){
    if(boton => 5){
        alert("Mayor a 5");
    }else{
        alert("Menor a 5")
    }
    console.log("HOLAAAA");
});

clean.addEventListener("click", function(){
    rate = '';
});