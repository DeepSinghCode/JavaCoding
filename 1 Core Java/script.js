const sidebar = document.querySelector(".sidebar");
const sidebarClose = document.querySelector("#sidebar-close");
const menu = document.querySelector(".menu-content");
const menuItems = document.querySelectorAll(".submenu-item");
const subMenuTitles = document.querySelectorAll(".submenu .menu-title");

sidebarClose.addEventListener("click", () => sidebar.classList.toggle("close"));

menuItems.forEach((item, index) => {
  item.addEventListener("click", () => {
    menu.classList.add("submenu-active");
    item.classList.add("show-submenu");
    menuItems.forEach((item2, index2) => {
      if (index !== index2) {
        item2.classList.remove("show-submenu");
      }
    });
  });
});

subMenuTitles.forEach((title) => {
  title.addEventListener("click", () => {
    menu.classList.remove("submenu-active");
  });
});

async function copyTextFromFile() {
  try {
      const response = await fetch('/images/Test.txt');
      const text = await response.text();

      const tempInput = document.createElement("textarea");
      tempInput.value = text;
      document.body.appendChild(tempInput);
      tempInput.select();
      document.execCommand("copy");
      document.body.removeChild(tempInput);

      alert("Text copied to clipboard");
  } catch (err) {
      console.error('Failed to copy text: ', err);
      alert("Failed to copy text");
  }
}

async function copyTextFromFile2() {
  try {
      const response = await fetch('/images/Account.java');
      const text = await response.text();

      const tempInput = document.createElement("textarea");
      tempInput.value = text;
      document.body.appendChild(tempInput);
      tempInput.select();
      document.execCommand("copy");
      document.body.removeChild(tempInput);

      alert("Text copied to clipboard");
  } catch (err) {
      console.error('Failed to copy text: ', err);
      alert("Failed to copy text");
  }
}

console.log(menuItems, subMenuTitles);

