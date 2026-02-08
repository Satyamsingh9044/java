document.getElementById("contactForm").addEventListener("submit", function (e) {
  e.preventDefault();

  const formData = {
    name: document.querySelector('input[name="name"]').value,
    email: document.querySelector('input[name="email"]').value,
    message: document.querySelector('textarea[name="message"]').value,
  };

  fetch("https://script.google.com/macros/s/AKfycbwDs2eVDLHdRX2o_vnlQgMS8mE1xCBR40cIELzSF1d5DU1sxhh8C6J9i6SxPuHDUbh06A/exec", {
    method: "POST",
    mode: "no-cors",  // Important to avoid CORS error
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(formData),
  })
    .then(() => {
      document.getElementById("response").textContent = "Form submitted successfully!";
      document.getElementById("contactForm").reset();
    })
    .catch((error) => {
      console.error("Error!", error.message);
      document.getElementById("response").textContent = "Failed to submit form.";
    });
});