function validateForm() {
    if (isEmpty($("#firstName").val().trim())) {
        alert('First name is required!');
        return false;
    }
    if (isEmpty($("#lastName").val().trim())) {
        alert('Last name is required!');
        return false;
    }
    if (isEmpty(($("#phone").val().trim()))) {
        alert('Phone is required!');
        return false;
    }
    if (isEmpty($("#email").val().trim())) {
        alert('Email is required!');
        return false;
    }
    if (!validateEmail($("#email").val().trim())) {
        alert('Email must be a valid email address!');
        return false;
    }
    if (isEmpty($("#arrivalDate").val().trim())) {
        alert('Arrival date is required!');
        return false;
    }
    if (isEmpty($("#departureDate").val().trim())) {
        alert('Departure date is required!');
        return false;
    }
    if (isEmpty($("#adults").val().trim())) {
        alert('Number of adults is required!');
        return false;
    }
    if (isEmpty($("#children").val().trim())) {
        alert('Number of children is required!');
        return false;
    }
    return true;
}

function isEmpty(str) {
    return (str.length === 0 || !str.trim());
}

function validateEmail(email) {
    var re = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,15}(?:\.[a-z]{2})?)$/i;
    return isEmpty(email) || re.test(email);
}