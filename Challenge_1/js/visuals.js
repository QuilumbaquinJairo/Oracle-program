const buttons = document.querySelectorAll("button");
const textarea = document.getElementById("outputTextarea");
const myButton = document.getElementById("copy-button");
const modButton=document.getElementById("modButton");

modButton.addEventListener("click",()=>{
    modButton.classList.toggle("active");
    document.body.classList.toggle("dark-mode");

});

buttons.forEach(button => {
    button.addEventListener('click', function() {
    if(emptyOrwhitespaces()){
        textarea.value="";
        textarea.setAttribute("placeholder", "Ningún mensaje fue Encontrado");
        myButton.style.visibility = "hidden";
    }else{
        myButton.style.visibility = "visible";
    }
    });
});


