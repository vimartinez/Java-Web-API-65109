import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import ApiConsumer from './components/APIConsumer';
import Contact from './components/contact';
import Home from './components/home';
import About from './components/about';
import NavBar from './components/navBar';
import {BrowserRouter as Router, Route, Routes} from 'react-router-dom'

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <Router>
    <NavBar name="Java Web API"/>
    <Routes>
      <Route path='/' element={<Home />} />
      <Route path='/contact' element={<Contact />} />
      <Route path='/apiconsumer' element={<ApiConsumer />} />
      <Route path='/about' element={<About />} />
    </Routes>
    </Router>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
