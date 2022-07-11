package com.cdac.app;

import java.time.LocalDate;

import com.cdac.dao.GenericDao;
import com.cdac.entity.Album;
import com.cdac.entity.Song;

public class AlbumSongExample {

	public static void main(String[] args) {
		
		GenericDao dao = new GenericDao();
		// Adding album
		/*Album album = new Album();
		album.setName("Arijit Singh's hits");
		album.setReleaseDate(LocalDate.of(2021, 10, 10));
		album.setCopyright("T-series");
		
		dao.save(album);
		*/
		
		//adding song to an album
		/*Album album = (Album) dao.fetchById(Album.class, 1);
		Song song = new Song();
		song.setTitle("song1");
		song.setDuration(4.50);
		song.setArtist("Arijit Singh");
		song.setAlbum(album);
		dao.save(song);
		*/
		
		
	}
}
