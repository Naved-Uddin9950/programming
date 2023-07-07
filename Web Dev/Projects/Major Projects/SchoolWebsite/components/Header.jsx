import '../styles/header.css'

const Header = () => {
  return (
    <div>
      <nav className="navbar navbar-expand-lg bg-primary">
        <div className="container-fluid">

          {/* School logo starts from here */}
          <a className="navbar-brand" href="#">
            <img src='../public/logo.svg' id="logo" />
          </a>
          {/* School logo ends here */}

          <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span className="navbar-toggler-icon"></span>
          </button>
          <div className="collapse navbar-collapse" id="navbarSupportedContent">
            <ul className="navbar-nav me-auto mb-2 mb-lg-0">
              <li className="nav-item">
                
                {/* Website Home Page */}
                <a className="nav-link active text-light" aria-current="page" href="#">Home</a>
              </li>
              
              {/* Pages starts from here */}
              <li className="nav-item dropdown">
                <a className="nav-link dropdown-toggle text-light" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                  Pages
                </a>
                <ul class="dropdown-menu">
                  <li><a className="dropdown-item" href="#">Classes</a></li>
                  <li><hr className="dropdown-divider" /></li>
                  <li><a className="dropdown-item" href="#">About Us</a></li>
                  <li><hr className="dropdown-divider" /></li>
                  <li><a className="dropdown-item" href="#">Admission</a></li>
                  <li><hr className="dropdown-divider" /></li>
                  <li><a className="dropdown-item" href="#">Programs</a></li>
                </ul>
              </li>

              {/* Teachers dropdown menu starts from here */}
              <li className="nav-item dropdown">
                <a className="nav-link dropdown-toggle text-light" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                  Faculty
                </a>
                <ul class="dropdown-menu">
                <li><a className="dropdown-item" href="#">Teachers Page</a></li>
                  <li><hr className="dropdown-divider" /></li>
                  <li><a className="dropdown-item" href="#">Single Teacher</a></li>
                </ul>
              </li>

              {/* Gallery starts from here */}
              <li className="nav-item dropdown">
                <a className="nav-link dropdown-toggle text-light" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                  Gallery
                </a>
                <ul class="dropdown-menu">
                <li><a className="dropdown-item" href="#">Classes</a></li>
                  <li><hr className="dropdown-divider" /></li>
                  <li><a className="dropdown-item" href="#">Computer Lab</a></li>
                  <li><hr className="dropdown-divider" /></li>
                  <li><a className="dropdown-item" href="#">Library</a></li>
                  <li><hr className="dropdown-divider" /></li>
                  <li><a className="dropdown-item" href="#">Terrace</a></li>
                </ul>
              </li>

              {/* Contact page starts from here */}
              <li className="nav-item dropdown">
                <a className="nav-link dropdown-toggle text-light" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                  Contact
                </a>
                <ul class="dropdown-menu">
                <li><a className="dropdown-item" href="#">Contact Us</a></li>
                  <li><hr className="dropdown-divider" /></li>
                  <li><a className="dropdown-item" href="#">Inquiry</a></li>
                </ul>
              </li>


            </ul>
            <form className="d-flex" role="search">
              <input className="form-control me-2" type="search" placeholder="Search" aria-label="Search" />
              <button className="btn btn-outline-info text-light" type="submit" id='searchBtn'>Search</button>
            </form>
          </div>
        </div>
      </nav>
    </div>
  )
}

export default Header;