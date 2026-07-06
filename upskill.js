// 1
<script src="main.js"></script>  //in HTML

// main.js
console.log("Welcome to the Community Portal");
window.onload = () => alert("Page fully loaded");

// 2
const eventName = "Music Fest";
const eventDate = "2026-06-10";
let seats = 50;

console.log(`${eventName} on ${eventDate}, Seats: ${seats}`);
seats--; // registration reduces seats


// 3
const events = [
  { name: "Music Fest", date: "2026-06-10", seats: 50 },
  { name: "Old Fair", date: "2025-01-01", seats: 0 }
];

events.forEach(e => {
  if (new Date(e.date) > new Date() && e.seats > 0) {
    console.log(e.name);
  }
});

try {
  if (events[0].seats <= 0) throw "No seats available";
  events[0].seats--;
} catch (err) {
  console.error(err);
}

// 4
function addEvent(name, date, seats) {
  return { name, date, seats };
}

function registerUser(event) {
  if (event.seats > 0) event.seats--;
}

function filterEventsByCategory(events, category, callback) {
  return events.filter(e => e.category === category).map(callback);
}

// Closure
function categoryCounter() {
  let count = 0;
  return () => ++count;
}
const musicCounter = categoryCounter();


// 5
function Event(name, date, seats) {
  this.name = name;
  this.date = date;
  this.seats = seats;
}
Event.prototype.checkAvailability = function() {
  return this.seats > 0;
};

const e1 = new Event("Music Fest", "2026-06-10", 50);
console.log(Object.entries(e1));

// 6
let events = [];
events.push({ name: "Music Fest", category: "music" });

let musicEvents = events.filter(e => e.category === "music");
let cards = events.map(e => `Event: ${e.name}`);

// 7
const container = document.querySelector("#events");
const card = document.createElement("div");
card.textContent = "Music Fest";
container.appendChild(card);

// Update UI
card.textContent = "Registered!";

// 8
document.getElementById("registerBtn").onclick = () => alert("Registered!");
document.getElementById("categorySelect").onchange = e => console.log(e.target.value);
document.getElementById("searchBox").onkeydown = e => console.log(e.key);

// 9
fetch("events.json")
  .then(res => res.json())
  .then(data => console.log(data))
  .catch(err => console.error(err));

async function loadEvents() {
  document.getElementById("spinner").style.display = "block";
  try {
    let res = await fetch("events.json");
    let data = await res.json();
    console.log(data);
  } finally {
    document.getElementById("spinner").style.display = "none";
  }
}

// 10
function greet(name = "Guest") {
  console.log(`Hello ${name}`);
}

const event = { name: "Music Fest", date: "2026-06-10" };
const { name, date } = event;

const cloned = [...events];


// 11
document.querySelector("form").onsubmit = e => {
  e.preventDefault();
  const { name, email, eventType } = e.target.elements;
  if (!name.value || !email.value) {
    document.getElementById("error").textContent = "Fill all fields";
  }
};


// 12
function registerUser(data) {
  fetch("https://mockapi.com/register", {
    method: "POST",
    body: JSON.stringify(data),
    headers: { "Content-Type": "application/json" }
  })
  .then(res => res.json())
  .then(() => alert("Success"))
  .catch(() => alert("Failed"));

  setTimeout(() => console.log("Response delayed"), 2000);
}


// 13
console.log("Form submitted");
console.log("Payload:", data);
// Use DevTools Console + Network tab, add breakpoints in Sources.


// 14
$('#registerBtn').click(() => alert("Registered with jQuery"));
$('.eventCard').fadeIn().fadeOut();
