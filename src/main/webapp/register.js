document.querySelector(".form-register")
    .addEventListener("submit",(e)=>{
    e.preventDefault()
        const firstname =document.querySelector("[name=\"firstname\"]")
       $.ajax({url:"register",
           type:"POST",
           data:{firstname:firstname},
           success:(result)=>{
           window.location.href="welcome.jsp"
           },
       error:(error)=>{
           console.log(error)
       }})
        console.log("test")

})