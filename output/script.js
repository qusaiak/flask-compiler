(() => {
    const form = document.getElementById("addition-form");
    const firstInput = document.getElementById("first-number");
    const secondInput = document.getElementById("second-number");
    const result = document.getElementById("calculation-result");

    if (!form || !firstInput || !secondInput || !result) {
        return;
    }

    function formatNumber(value) {
        return Number.isInteger(value) ? String(value) : String(Number(value.toFixed(6)));
    }

    function calculate() {
        const first = Number.parseFloat(firstInput.value);
        const second = Number.parseFloat(secondInput.value);

        if (Number.isNaN(first) || Number.isNaN(second)) {
            result.textContent = "أدخل رقمين صحيحين أولًا.";
            result.classList.add("is-error");
            return;
        }

        result.textContent = `المجموع: ${formatNumber(first + second)}`;
        result.classList.remove("is-error");
    }

    form.addEventListener("submit", (event) => {
        event.preventDefault();
        calculate();
    });
    firstInput.addEventListener("input", calculate);
    secondInput.addEventListener("input", calculate);
    calculate();
})();
