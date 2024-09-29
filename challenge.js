
var data = [
    { id: 1, name: "Janu", English: 50, Maths: 86, Science: 77, SocialScience: 89 },
    { id: 2, name: "Tanu", English: 75, Maths: 96, Science: 67, SocialScience: 91 },
    { id: 3, name: "Tara", English: 90, Maths: 35, Science: 86, SocialScience: 100 },
    { id: 4, name: "Glen", English: 79, Maths: 68, Science: 77, SocialScience: 68 },
    { id: 5, name: "Zara", English: 80, Maths: 85, Science: 96, SocialScience: 68 },
];


let currentPage = 1;
const rowsPerPage = 2;

window.onload = function () {
    populateTable(data, currentPage);
};




function populateTable(data, page) {
    let tableBody = document.querySelector("#studentTable tbody");
    tableBody.innerHTML = "";

    let start = (page - 1) * rowsPerPage;
    let end = start + rowsPerPage;
    let paginatedData = data.slice(start, end);

    paginatedData.forEach(student => {
        
        let row = `<tr>
                    <td>${student.id}</td>
                    <td>${student.name}</td>
                    <td>${student.English}</td>
                    <td>${student.Maths}</td>
                    <td>${student.Science}</td>
                    <td>${student.SocialScience}</td>
                   </tr>`;
        tableBody.innerHTML += row;
    });

    createPaginationButtons(data.length);
}


document.getElementById('filterBtn').addEventListener('click', function () {
    let subject = document.getElementById("subject").value;
    let filterOption = document.querySelector('input[name="filter"]:checked');

    if (!filterOption) {
        alert("Please select a filter option: Above, Below, or Between.");
        return;
    }

    let filterValue1 = document.getElementById("filterValue1").value;
    let filterValue2 = document.getElementById("filterValue2").value;

    if (!filterValue1) {
        alert("Please enter a valid value.");
        return;
    }

    let filteredData = data.filter(student => {
        if (filterOption.value === 'above') {
            return student[subject] > parseInt(filterValue1);
        } else if (filterOption.value === 'below') {
            return student[subject] < parseInt(filterValue1);
        } else if (filterOption.value === 'between') {
            return student[subject] >= parseInt(filterValue1) && student[subject] <= parseInt(filterValue2);
        }
    });

    if (filteredData.length === 0) {
        alert('No records found matching the filter criteria.');
    } else {
        populateTable(filteredData, 1);
    }
});


document.getElementById('clearBtn').addEventListener('click', function () {
    document.getElementById("filterValue1").value = '';
    document.getElementById("filterValue2").value = '';
    populateTable(data, currentPage);
});

document.querySelectorAll('input[name="filter"]').forEach(function (elem) {
    elem.addEventListener('change', function () {
        if (this.value === 'between') {
            document.getElementById("filterValue2").style.display = 'inline';
        } else {
            document.getElementById("filterValue2").style.display = 'none'; 
        }
    });
});


function createPaginationButtons(totalRows) {
    let totalPages = Math.ceil(totalRows / rowsPerPage);
    let paginationDiv = document.getElementById("pagination");
    paginationDiv.innerHTML = "";

    for (let i = 1; i <= totalPages; i++) {
        let button = document.createElement("button");
        button.innerText = i;
        button.classList.add("page-btn");
        if (i === currentPage) {
            button.classList.add("active");
        }
        button.addEventListener('click', function () {
            currentPage = i;
            populateTable(data, currentPage);
        });
        paginationDiv.appendChild(button);
    }
}
