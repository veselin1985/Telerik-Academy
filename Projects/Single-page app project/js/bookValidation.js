function validateForm() {
    if (isEmpty($("#firstName").val().trim())) {
        alert('First name is required!');
        return false;
    }
    if (isEmpty($("#lastName").val().trim())) {
        alert("Last name is required!");
        return false;
    }
    if (isEmpty($("#phone").val().trim())) {
        alert("Phone is required!");
        return false;
    }
    if (!validatePhone(($("#phone").val().trim()))) {
        alert("Phone field must contains only digits, '+' or '-' ! No spaces are allowed!");
        return false;
    }
    if (isEmpty($("#email").val().trim())) {
        alert("Email is required!");
        return false;
    }
    if (!validateEmail($("#email").val().trim())) {
        alert("Email must be a valid email address!");
        return false;
    }
    if (isEmpty($("#arrivalDate").val().trim())) {
        alert("Arrival date is required!");
        return false;
    }
    if (isEmpty($("#departureDate").val().trim())) {
        alert("Departure date is required!");
        return false;
    }
    if (($("#adults").val().trim()) == "0" && ($("#children").val().trim()) == "0") {
        alert('Both Children and Adults cannot be 0!');
        return false;
    }
    if ($("#arrivalDate").val().trim() >= $("#departureDate").val().trim()) {
        alert("Arrival date cannot be after or equal to Departure date!")
        return false
    }

    return true;
}

function isEmpty(str) {
    return (str.length === 0 || !str.trim());
}

function validateEmail(email) {
    var mail_pattern = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,15}(?:\.[a-z]{2})?)$/i;
    return isEmpty(email) || mail_pattern.test(email);
}

function validatePhone(phone) {
    var phone_pattern = /^[0-9-+]+$/ ;
    return isEmpty(phone) || phone_pattern.test(phone);
}


function submitted() {
    alert('Book submitted!');
}