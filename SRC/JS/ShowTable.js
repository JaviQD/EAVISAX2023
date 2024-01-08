function ShowTable() {
    let num = document.getElementsById("numero").value;
    if(isNaN(num)){
       console.error('Ingresa un numero valida');
       return;
    }
    for (i = 1; i <= 10; i++){
        console.log(`La tabla del nnumero ${num} es: ${num} x ${i} = ${num * i}`);
    }
}      

