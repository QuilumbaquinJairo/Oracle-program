
function getText(){
    return document.getElementById("myTextarea").value;
}

function clearTextArea(){
    document.getElementById("myTextarea").value="";
}
function verifyEspecialCharacters(){
    let vrfText=getText();
    const regex = /[^A-Za-z0-9]/g;
    return regex.test(vrfText);
}
function emptyOrwhitespaces(){
    return getText().trim() === '';
}

function validaciones(){
    return (verifyEspecialCharacters()||emptyOrwhitespaces());
}
function encriptar(){
    let texto = getText();
    var textoEncriptado;


        textoEncriptado = texto.replace(/e/g, "enter");
        textoEncriptado = textoEncriptado.replace(/i/g, "imes");
        textoEncriptado = textoEncriptado.replace(/a/g, "ai");
        textoEncriptado = textoEncriptado.replace(/o/g, "ober");
        textoEncriptado = textoEncriptado.replace(/u/g, "ufat");

        return textoEncriptado;

}

function desencriptar(){
    let encriptedMsg=getText();
    var textodesEncriptado;

        textodesEncriptado = encriptedMsg.replace(/enter/gi, "e");
        textodesEncriptado = textodesEncriptado.replace(/imes/gi, "i");
        textodesEncriptado = textodesEncriptado.replace(/ai/gi, "a");
        textodesEncriptado = textodesEncriptado.replace(/ober/gi, "o");
        textodesEncriptado = textodesEncriptado.replace(/ufat/gi, "u");
        console.log(textodesEncriptado);
        return textodesEncriptado;

}

function writeMessage(mensaje){
    document.getElementById("outputTextarea").value=mensaje;
}
function encriptarButton(){
    if(validaciones()!==true){
        let mensaje = encriptar();
        writeMessage(mensaje);
    }else{
        alert("entrada no valida");
        clearTextArea();
    }
}

function desencriptarButton(){
    if(validaciones()!==true){
        let mensaje = desencriptar();
        writeMessage(mensaje);
    }else{
        alert("entrada no valida");
        clearTextArea();
    }
}

function copiarButton(){
    var textarea = document.getElementById("outputTextarea");
        textarea.select();
        navigator.clipboard.writeText(textarea.value);
}




















