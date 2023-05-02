package oop.inheritance;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class MainTest {
    @Test
    public void when1IsTyped_thenShowSale() {
        //Given
        Application application = mock(Application.class);
        when(application.readKey()).thenReturn("1");
        //When
        Main.run(application);
        //Then
        verify(application).clearScreen();
        verify(application).showMenu();
        verify(application).readKey();
        verify(application).doSale();

        verifyNoMoreInteractions(application);

    }
    @Test
    public void when2IsTyped_thenShowRefund() {
        //Given
        Application application = mock(Application.class);
        when(application.readKey()).thenReturn("2");
        //When
        Main.run(application);
        //Then
        verify(application).clearScreen();
        verify(application).showMenu();
        verify(application).readKey();
        verify(application).doRefund();

        verifyNoMoreInteractions(application);

    }
    @Test
    public void when3IsTyped_thenPrintReport() {
        //Given
        Application application = mock(Application.class);
        when(application.readKey()).thenReturn("3");
        //When
        Main.run(application);
        //Then
        verify(application).clearScreen();
        verify(application).showMenu();
        verify(application).readKey();
        verify(application).printReport();

        verifyNoMoreInteractions(application);

    }
    @Test
    public void when4IsTyped_thenShowConfiguration() {
        //Given
        Application application = mock(Application.class);
        when(application.readKey()).thenReturn("4");
        //When
        Main.run(application);
        //Then
        verify(application).clearScreen();
        verify(application).showMenu();
        verify(application).readKey();
        verify(application).showConfiguration();

        verifyNoMoreInteractions(application);

    }
}
