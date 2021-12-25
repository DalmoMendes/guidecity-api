package br.ceproirr.guidecity.mapper;

import br.ceproirr.guidecity.dto.request.AdressDTO;
import br.ceproirr.guidecity.dto.request.NetworkDTO;
import br.ceproirr.guidecity.dto.request.PersonDTO;
import br.ceproirr.guidecity.dto.request.PhoneDTO;
import br.ceproirr.guidecity.entity.Adress;
import br.ceproirr.guidecity.entity.Network;
import br.ceproirr.guidecity.entity.Person;
import br.ceproirr.guidecity.entity.Phone;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-12-25T09:21:49-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.13 (Azul Systems, Inc.)"
)
public class PersonMapperImpl implements PersonMapper {

    @Override
    public Person toModel(PersonDTO personDTO) {
        if ( personDTO == null ) {
            return null;
        }

        Person person = new Person();

        if ( personDTO.getBirthDate() != null ) {
            person.setBirthDate( LocalDate.parse( personDTO.getBirthDate(), DateTimeFormatter.ofPattern( "dd-MM-yyyy" ) ) );
        }
        person.setId( personDTO.getId() );
        person.setFirstName( personDTO.getFirstName() );
        person.setLastName( personDTO.getLastName() );
        person.setEmail( personDTO.getEmail() );
        person.setCpf( personDTO.getCpf() );
        person.setPhones( phoneDTOListToPhoneList( personDTO.getPhones() ) );
        person.setNetwork( networkDTOListToNetworkList( personDTO.getNetwork() ) );
        person.setAdress( adressDTOListToAdressList( personDTO.getAdress() ) );
        person.setStatus( personDTO.getStatus() );

        return person;
    }

    @Override
    public PersonDTO toDTO(Person person) {
        if ( person == null ) {
            return null;
        }

        PersonDTO personDTO = new PersonDTO();

        personDTO.setId( person.getId() );
        personDTO.setFirstName( person.getFirstName() );
        personDTO.setLastName( person.getLastName() );
        personDTO.setEmail( person.getEmail() );
        personDTO.setCpf( person.getCpf() );
        if ( person.getBirthDate() != null ) {
            personDTO.setBirthDate( DateTimeFormatter.ISO_LOCAL_DATE.format( person.getBirthDate() ) );
        }
        personDTO.setPhones( phoneListToPhoneDTOList( person.getPhones() ) );
        personDTO.setNetwork( networkListToNetworkDTOList( person.getNetwork() ) );
        personDTO.setAdress( adressListToAdressDTOList( person.getAdress() ) );
        personDTO.setStatus( person.getStatus() );

        return personDTO;
    }

    protected Phone phoneDTOToPhone(PhoneDTO phoneDTO) {
        if ( phoneDTO == null ) {
            return null;
        }

        Phone phone = new Phone();

        phone.setId( phoneDTO.getId() );
        phone.setType( phoneDTO.getType() );
        phone.setNumber( phoneDTO.getNumber() );
        phone.setStatus( phoneDTO.getStatus() );

        return phone;
    }

    protected List<Phone> phoneDTOListToPhoneList(List<PhoneDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Phone> list1 = new ArrayList<Phone>( list.size() );
        for ( PhoneDTO phoneDTO : list ) {
            list1.add( phoneDTOToPhone( phoneDTO ) );
        }

        return list1;
    }

    protected Network networkDTOToNetwork(NetworkDTO networkDTO) {
        if ( networkDTO == null ) {
            return null;
        }

        Network network = new Network();

        network.setId( networkDTO.getId() );
        network.setName( networkDTO.getName() );
        network.setLink( networkDTO.getLink() );
        network.setStatus( networkDTO.getStatus() );

        return network;
    }

    protected List<Network> networkDTOListToNetworkList(List<NetworkDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Network> list1 = new ArrayList<Network>( list.size() );
        for ( NetworkDTO networkDTO : list ) {
            list1.add( networkDTOToNetwork( networkDTO ) );
        }

        return list1;
    }

    protected Adress adressDTOToAdress(AdressDTO adressDTO) {
        if ( adressDTO == null ) {
            return null;
        }

        Adress adress = new Adress();

        adress.setId( adressDTO.getId() );
        adress.setZipcode( adressDTO.getZipcode() );
        adress.setStreet( adressDTO.getStreet() );
        adress.setNumber( adressDTO.getNumber() );
        adress.setDistrict( adressDTO.getDistrict() );
        adress.setState( adressDTO.getState() );
        adress.setCountry( adressDTO.getCountry() );
        adress.setStatus( adressDTO.getStatus() );

        return adress;
    }

    protected List<Adress> adressDTOListToAdressList(List<AdressDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Adress> list1 = new ArrayList<Adress>( list.size() );
        for ( AdressDTO adressDTO : list ) {
            list1.add( adressDTOToAdress( adressDTO ) );
        }

        return list1;
    }

    protected PhoneDTO phoneToPhoneDTO(Phone phone) {
        if ( phone == null ) {
            return null;
        }

        PhoneDTO phoneDTO = new PhoneDTO();

        phoneDTO.setId( phone.getId() );
        phoneDTO.setType( phone.getType() );
        phoneDTO.setNumber( phone.getNumber() );
        phoneDTO.setStatus( phone.getStatus() );

        return phoneDTO;
    }

    protected List<PhoneDTO> phoneListToPhoneDTOList(List<Phone> list) {
        if ( list == null ) {
            return null;
        }

        List<PhoneDTO> list1 = new ArrayList<PhoneDTO>( list.size() );
        for ( Phone phone : list ) {
            list1.add( phoneToPhoneDTO( phone ) );
        }

        return list1;
    }

    protected NetworkDTO networkToNetworkDTO(Network network) {
        if ( network == null ) {
            return null;
        }

        NetworkDTO networkDTO = new NetworkDTO();

        networkDTO.setId( network.getId() );
        networkDTO.setName( network.getName() );
        networkDTO.setLink( network.getLink() );
        networkDTO.setStatus( network.getStatus() );

        return networkDTO;
    }

    protected List<NetworkDTO> networkListToNetworkDTOList(List<Network> list) {
        if ( list == null ) {
            return null;
        }

        List<NetworkDTO> list1 = new ArrayList<NetworkDTO>( list.size() );
        for ( Network network : list ) {
            list1.add( networkToNetworkDTO( network ) );
        }

        return list1;
    }

    protected AdressDTO adressToAdressDTO(Adress adress) {
        if ( adress == null ) {
            return null;
        }

        AdressDTO adressDTO = new AdressDTO();

        adressDTO.setId( adress.getId() );
        adressDTO.setZipcode( adress.getZipcode() );
        adressDTO.setStreet( adress.getStreet() );
        adressDTO.setNumber( adress.getNumber() );
        adressDTO.setDistrict( adress.getDistrict() );
        adressDTO.setState( adress.getState() );
        adressDTO.setCountry( adress.getCountry() );
        adressDTO.setStatus( adress.getStatus() );

        return adressDTO;
    }

    protected List<AdressDTO> adressListToAdressDTOList(List<Adress> list) {
        if ( list == null ) {
            return null;
        }

        List<AdressDTO> list1 = new ArrayList<AdressDTO>( list.size() );
        for ( Adress adress : list ) {
            list1.add( adressToAdressDTO( adress ) );
        }

        return list1;
    }
}
