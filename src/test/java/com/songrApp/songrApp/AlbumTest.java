package com.songrApp.songrApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlbumTest {
    @Test
    public void testGettersAndSetters(){
        Album album = new Album("title", "Artist", 12, 500,
                "ImageUrl");
        assertEquals("title", album.getTitle());
        assertEquals("Artist", album.getArtist());
        assertEquals(12, album.getSongCount());
        assertEquals(500, album.getLength());
        assertEquals("ImageUrl", album.getImageUrl());

    }

}
