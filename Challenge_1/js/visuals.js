const buttons = document.querySelectorAll("button");
const textarea = document.getElementById("ouputTextarea");
const myButton = document.getElementById("copy-button");
const modButton=document.getElementById("modButton");

modButton.addEventListener("click",()=>{
    modButton.classList.toggle("active");

});
buttons.forEach(button => {
    button.addEventListener('click', function() {
    if(emptyOrwhitespaces()){
        textarea.value="";
        textarea.setAttribute("placeholder", "Ningún mensaje fue Encontrado");
        textarea.style.backgroundColor="white";
        myButton.style.visibility = "hidden";
    }else{
        textarea.style.backgroundColor="#D8DFE8";
        myButton.style.visibility = "visible";
    }
    });
});


