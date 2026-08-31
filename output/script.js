(() => {
    const calculatorForm = document.getElementById("addition-form");
    const firstInput = document.getElementById("first-number");
    const secondInput = document.getElementById("second-number");
    const calculationResult = document.getElementById("calculation-result");

    if (calculatorForm && firstInput && secondInput && calculationResult) {
        const formatNumber = (value) => Number.isInteger(value)
            ? String(value)
            : String(Number(value.toFixed(6)));

        const calculate = () => {
            const first = Number.parseFloat(firstInput.value);
            const second = Number.parseFloat(secondInput.value);
            if (Number.isNaN(first) || Number.isNaN(second)) {
                calculationResult.textContent = "أدخل رقمين صحيحين أولًا.";
                calculationResult.classList.add("is-error");
                return;
            }
            calculationResult.textContent = `المجموع: ${formatNumber(first + second)}`;
            calculationResult.classList.remove("is-error");
        };

        calculatorForm.addEventListener("submit", (event) => {
            event.preventDefault();
            calculate();
        });
        firstInput.addEventListener("input", calculate);
        secondInput.addEventListener("input", calculate);
        calculate();
    }
})();

(() => {
    const grid = document.getElementById("products-grid");
    if (!grid) return;

    const escapeHtml = (value) => String(value ?? "")
        .replaceAll("&", "&amp;")
        .replaceAll("<", "&lt;")
        .replaceAll(">", "&gt;")
        .replaceAll('"', "&quot;")
        .replaceAll("'", "&#039;");

    const renderProducts = (products) => {
        if (!Array.isArray(products) || products.length === 0) {
            grid.innerHTML = '<p class="empty-products">لا يوجد منتجات حاليًا</p>';
            return;
        }

        grid.innerHTML = products.map((product) => {
            const id = Number(product.id);
            const safeId = Number.isInteger(id) ? id : escapeHtml(product.id);
            return `
                <div class="product-card" data-product-id="${safeId}">
                    <img src="${escapeHtml(product.image || "default.jpg")}"
                         alt="${escapeHtml(product.name)}"
                         class="product-image" />
                    <div class="product-info">
                        <h3 class="product-name">${escapeHtml(product.name)}</h3>
                        <p class="product-price">$${escapeHtml(product.price)}</p>
                        <div class="product-actions">
                            <a href="/product?id=${encodeURIComponent(safeId)}" class="btn-detail">التفاصيل</a>
                            <a href="/edit/${encodeURIComponent(safeId)}" class="btn-edit">تعديل</a>
                            <button type="button" class="btn-delete ajax-delete"
                                    data-product-id="${safeId}">حذف</button>
                        </div>
                    </div>
                </div>`;
        }).join("");
    };

    const loadProducts = async () => {
        const response = await fetch("/api/products", {
            headers: { Accept: "application/json" },
            cache: "no-store"
        });
        if (!response.ok) throw new Error("تعذر تحميل المنتجات");
        renderProducts(await response.json());
    };

    grid.addEventListener("click", async (event) => {
        const button = event.target.closest(".ajax-delete");
        if (!button) return;
        event.preventDefault();
        if (!window.confirm("هل تريد حذف هذا المنتج؟")) return;

        button.disabled = true;
        try {
            const response = await fetch(`/api/products/${button.dataset.productId}`, {
                method: "DELETE",
                headers: { Accept: "application/json" }
            });
            const result = await response.json();
            if (!response.ok) throw new Error(result.error || "تعذر حذف المنتج");
            renderProducts(result.products);
        } catch (error) {
            window.alert(error.message);
            button.disabled = false;
        }
    });

    // يلتقط التغييرات التي تمت من تبويب آخر أو من مسار Flask التقليدي.
    window.setInterval(() => loadProducts().catch(() => {}), 2000);
    loadProducts().catch(() => {});
})();

// اعتراض نموذج الإضافة، ثم الانتقال إلى صفحة المنتجات دون إعادة إرسال النموذج.
(() => {
    const form = document.querySelector('form[data-ajax="product-add"]');
    if (!form) return;

    form.addEventListener("submit", async (event) => {
        event.preventDefault();
        const payload = Object.fromEntries(new FormData(form).entries());
        try {
            const response = await fetch("/api/products", {
                method: "POST",
                headers: {
                    "Content-Type": "application/json",
                    Accept: "application/json"
                },
                body: JSON.stringify(payload)
            });
            const result = await response.json();
            if (!response.ok) throw new Error(result.error || "تعذر إضافة المنتج");
            window.location.href = "/products";
        } catch (error) {
            window.alert(error.message);
        }
    });
})();

(() => {
    const form = document.querySelector('form[data-ajax="product-edit"]');
    if (!form) return;

    form.addEventListener("submit", async (event) => {
        event.preventDefault();
        const payload = Object.fromEntries(new FormData(form).entries());
        delete payload.image_file;
        try {
            const response = await fetch(`/api/products/${form.dataset.productId}`, {
                method: "PATCH",
                headers: {
                    "Content-Type": "application/json",
                    Accept: "application/json"
                },
                body: JSON.stringify(payload)
            });
            const result = await response.json();
            if (!response.ok) throw new Error(result.error || "تعذر تعديل المنتج");
            window.location.href = "/products";
        } catch (error) {
            window.alert(error.message);
        }
    });
})();
