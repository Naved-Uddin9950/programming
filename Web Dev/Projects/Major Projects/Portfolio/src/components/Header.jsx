import "../styles/header.css";

const Header = () => {
  return (
    <>
      <nav className="navbar bg-primary navbar-container" data-bs-theme>
        <div className="container-fluid">
          <a className="navbar-brand text-shadow">Naved Uddin</a>
          <form className="d-flex" role="search">
            <input className="form-control me-2" type="search" placeholder="Search" aria-label="Search" id="searchField"/>
            <button className="btn btn-outline-light text-light searchButton fa-solid fa-magnifying-glass" type="submit" id="searchButton"></button>
          </form>
        </div>
      </nav>
    </>
  )
}


export default Header;