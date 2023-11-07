import logo from './logo.svg';
import './App.css';
import SaludoClass from './components/saludoClass'
import SaludoFunction from './components/saludoFunction';
import SaludoEstilo from './components/saludoEstilo';
import SaludoBootstrap from './components/saludoBootstrap';

function App() {
  return (
    <div className="App">
      {/*<header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
  </header>*/}
      <SaludoClass name="Pedro" />
      <SaludoFunction name="Julieta"/>
      <SaludoEstilo />
      <SaludoBootstrap text="componente Bootstrap!"/>
      <SaludoBootstrap text="componente Bootstrap 2!"/>
    </div>
  );
}

export default App;
