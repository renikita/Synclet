
const elements = document.querySelectorAll('.fade-in');

const observer = new IntersectionObserver((entries, observer) => {
    entries.forEach(entry => {
        if (entry.isIntersecting) {
            entry.target.classList.add('visible');
            observer.unobserve(entry.target);
        }
    });
}, {
    threshold: 0.5
});

elements.forEach(element => {
    observer.observe(element);
});

document.addEventListener('DOMContentLoaded', () => {
    const counters = document.querySelectorAll('.count-up');

    const startCounting = (counter) => {
        const speed = counter.getAttribute('data-speed') || 700;

        const updateCount = () => {
            const target = counter.getAttribute('data-target');
            const count = +counter.innerText;

            if (target === '∞') {
                const targetNumber = 1000;
                const increment = targetNumber / speed;

                if (count < targetNumber) {
                    counter.innerText = Math.ceil(count + increment);
                    setTimeout(updateCount, 20);
                } else {
                    fadeOut(counter, () => {
                        counter.innerText = '∞';
                        fadeIn(counter);
                    });
                }
            } else {
                const targetNumber = +target;
                const increment = targetNumber / speed;

                if (count < targetNumber) {
                    counter.innerText = Math.ceil(count + increment);
                    setTimeout(updateCount, 20);
                } else {
                    counter.innerText = targetNumber;
                    addSuffix(counter);
                }
            }
        };

        const fadeOut = (element, callback) => {
            element.style.transition = "opacity 1s";
            element.style.opacity = 0;
            setTimeout(() => {
                callback();
            }, 1000);
        };

        const fadeIn = (element) => {
            element.style.opacity = 0;
            setTimeout(() => {
                element.style.transition = "opacity 1s";
                element.style.opacity = 1;
            }, 50);
        };

        const addSuffix = (counter) => {
            const target = counter.getAttribute('data-target');
            let suffix = '';
            if (target === '37') {
                suffix = ' GB';
            } else if (target === '100') {
                suffix = ' %';
            } else if (target === '24') {
                suffix = '/7';
            }
            const suffixElement = document.createElement('span');
            suffixElement.classList.add('suffix');
            suffixElement.innerText = suffix;
            counter.appendChild(suffixElement);
            setTimeout(() => {
                suffixElement.style.opacity = 1;
            }, 100);
        };

        updateCount();
    };

    const observer = new IntersectionObserver((entries, observer) => {
        entries.forEach(entry => {
            if (entry.isIntersecting) {
                startCounting(entry.target);
                observer.unobserve(entry.target);
            }
        });
    }, {
        threshold: 0.5
    });

    counters.forEach(counter => {
        observer.observe(counter);
    });
});

