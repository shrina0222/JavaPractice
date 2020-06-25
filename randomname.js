const name = ["shrina Patel", "deep Singh", "ahmed muj", "shakur", "chudimin", "sumid",
				"dishti sheth", "edson aguiar", "honorinicy", "kelly liu", "kinjan shah", 
				"lan ru", "lauran", "liujunyu", "Isy", "muhammed rabiuumar", "pwang",
				"prithviatani", "richard chow", "Sahil Sandhu", "Kabir rumie", "scott",
				"shahbaz mansahia", "siyuqqq", "Shanchun yang", "tao", "tony li",
				"tosaku", "Akshay trivedi", "chao li", "vananhtrg", "yan huang", "zhaosaitong"];

const getRandomNumber = (max) => Math.floor(Math.random() * max);

const getRandomName = () => 
  `${name[getRandomNumber(name.length)]}`;

//console.log(getRandomName());
const setRandomName = () => {
document.getElementById('random-name').innerText = getRandomName();
}

document.getElementById('generate').addEventListener('click', setRandomName);
                      

setRandomName();