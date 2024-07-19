import axios from 'axios';

export default axios.create({
    baseURL:'http://localhost:8080', //always include the https part to not have any problems regarding the connections. If the back end is on another device, an ngrok is required to be setup in order to access the address
});