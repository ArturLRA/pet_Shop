import Carousel from 'react-bootstrap/Carousel';
import React from 'react';
import banner01 from '../imagens/Banner-01.jpg';
import banner02 from '../imagens/banner.jpg';
import banner03 from '../imagens/banho-e-tosa.png';


function Banner() {
  return (
    <Carousel>
      <Carousel.Item className='banner'>
        <img src={ banner01 } alt='banner cachorro com sua dona'/>
      </Carousel.Item>
      
        
      <Carousel.Item className='banner'>
      <img src={ banner02 } alt='cachorro e gato descansando'/>
      </Carousel.Item>

      <Carousel.Item className='banner'>
      <img src={ banner03 } alt='cachorros tomando banho'/>
      </Carousel.Item>
    </Carousel>
  );
}
export default Banner